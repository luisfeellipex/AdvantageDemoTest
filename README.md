# Advantage Demo

Este é o projeto de automação de testes que criei para a avaliação. O meu foco principal aqui foi entregar um código limpo, de fácil manutenção e sem testes intermitentes.

## 🛠️ Stack Utilizada
* Java + Selenium WebDriver
* Cucumber
* JUnit + Maven
* WebDriverManager
* ExtentReports 

## 🏗️ Como estruturei o código
Adotei o padrão Page Object Model (POM), mas separei bem as responsabilidades para que o código não ficasse repetitivo:

* **Elements:** Onde mapeei os botões e os campos, priorizando os localizadores ID e CSS Selector para não haver ambiguidade ou confusão durante o uso.
* **Pages:** Onde ficam as lógicas de interação de cada tela.
* **CommonPage:** Criei essa classe para atuar como uma "Base Page". Em vez de repetir os comandos do Selenium e as esperas em todas as telas, centralizei ações como `click`, `sendKeys` e os `waits` nela. Assim, as outras páginas apenas chamam essa classe mãe.

## ⚙️ Sincronização
O site foi desenvolvido em AngularJS, o que significa que o *loader* global e o *popup* escuro de login demoram alguns milissegundos para desaparecer da tela. Se o clique for muito rápido, ele é interceptado pela animação e o teste quebra.

Para resolver isso e garantir a estabilidade dos cenários:

* Criei esperas explícitas diretamente no método de clique genérico da `CommonPage`. O código sempre verifica se o *loader* desapareceu antes de tentar clicar em qualquer elemento.
* Já para o *popup* eu adicionei essa espera ao método do login. Assim a espera aguarda o elemento ficar totalmente invisível antes de prosseguir ao próximo passo.

## 🚀 Como rodar o projeto
1. Clone este repositório.
2. Certifique-se de que possui o Java e o Maven configurados nas variáveis de ambiente da sua máquina.
3. Abra o terminal na pasta raiz do projeto e execute o comando:

```bash
mvn test
```
4. Ao finalizar a execução, o relatório com as evidências de sucesso ou falha será gerado no diretório target/reports. Basta abrir o arquivo HTML correspondente no seu navegador.
