# Mailee - Email marketing para quem entende de tecnologia.

## O problema

  Você está desenvolvendo um sistema (e-commerce, cms, erp...) e o seu cliente solicita a possibilidade de enviar e-mails promocionais, ou notícias, para diversos contatos. Por experiência própria, você sabe que enviar e-mails não é coisa para _scriptkiddies_, e que, de fato, não vale a pena o esforço de desenvolver todo um sistema que faça o envio, garanta a entrega, analise os retornos e também apresente resultados de tudo isso. O problema é que os sistemas que você conhece não permitem uma integração fácil e rápida com seus sistemas em Java...

### A solução

  Esta biblioteca tem como objetivo manter os contatos da sua aplicação sincronizados com os contatos do Mailee (www.mailee.me) sem muito esforço. De fato, basta executar o método "sync_with_mailee" no seu modelo (clientes, contatos, pessoas...) que este irá automaticamente realizar as tarefas de inserir, atualizar, excluir e descadastrar via REST. No Mailee, seu cliente poderá então montar as mensagens e enviar para os contatos.

### O que posso fazer com a biblioteca?

 * Simplesmente utilizar as classes do Mailee para:
   * Criar, atualizar, buscar e excluir contatos.
   * Importar contatos com nome e email.
   * Criar, atualizar, buscar e excluir listas.
   * Criar rascunhos, enviar testes e enviar mensagens agora ou para uma data futura. O envio de mensagens permite enviar para uma lista, para um conjunto de emails, definindo o html na mão ou usando um template do Mailee.me e definindo áreas editáveis e de repetições.

## Instalação

 * Em breve

### Compatibilidade

  Utilizamos biblioteca jactiveresource http://jactiveresource.org/
  Só foram feitos testes com o Java 6, caso tenha interesse em fazer a biblioteca funcionar em uma versão mais antiga entre em contato.

## Uso

 * Em breve