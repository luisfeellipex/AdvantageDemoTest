#language: pt
@run
Funcionalidade: Regressão de Fluxos Operacionais - Advantage Online Shopping

Contexto:
  Dado que navego ate a home page do sistema

@login
Esquema do Cenario: Autenticacao de Usuario
  E clico no icone de acesso ao perfil
  E informo o usuario "<usuario>"
  E informo a senha "<senha>"
  Quando confirmo o login
  Entao verifico se a sessao foi iniciada com o nome do usuario

Exemplos:
  | usuario       | senha        |
  | luisfelipe.ta | JeJ9fKu6gUZ3 |

@contactus
Esquema do Cenario: Fale Conosco
  E acesso a secao de fale conosco
  E seleciono a categoria no fale conosco "<categoria>"
  E seleciono o produto no fale conosco "<produto>"
  E informo o email de contato
  E informo o assunto da mensagem
  Quando envio a mensagem
  Entao valido o recebimento do contato

Exemplos:
  | categoria | produto                          |
  | Laptops   | HP Chromebook 14 G1(ENERGY STAR) |

@checkout
Esquema do Cenario: Pedido e Pagamento
  E clico no icone de acesso ao perfil
  E informo o usuario "<usuario>"
  E informo a senha "<senha>"
  E confirmo o login
  E seleciono a categoria de produto "<categoria>"
  E seleciono o produto de compra "<produto>"
  E adiciono o item ao carrinho de compras
  E acesso o checkout
  Quando realizo o pagamento com "<userSP>" e "<passSP>"
  Entao o sistema deve exibir a confirmaçao da compra

Exemplos:
  | usuario       | senha        | categoria | produto | userSP        | passSP       |
  | luisfelipe.ta | JeJ9fKu6gUZ3 | Laptops   | 9       | luisfelipe.ta | JeJ9fKu6gUZ3 |