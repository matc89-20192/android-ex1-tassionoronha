# Exercício 1 - Alô, Mundo!

## Avaliação

A avaliação será realizada por meio de testes automatizados. Os casos de teste estão implementados na classe `CorrecaoTest`. Para obter a nota máxima, seu código deve passar em todos os casos de teste.

Para executar os casos de teste através do Android Studio, clique com o botão direito sobre a classe `CorrecaoTest` e escolha a opção `Run 'CorrecaoTest'`. Aguarde o final da execução.

Note que, para a correção oficial, os testes serão executados no emulador Genymotion, usando a máquina virtual "Custom Phone - 4.1.1 - API 16 - 768x1280". Recomenda-se o uso do Android Studio 2.3.3, pois o código inicial foi criado nessa versão da IDE.

## Forma de entrega

A entrega dos exercícios será feita através do [GitHub Classroom](https://classroom.github.com/) (não confundir com Google Classroom). Confira abaixo o link para a página do exercício no GitHub Classroom, que inclui informações como o prazo de entrega.

Você precisará usar o sistema de controle de versão Git para submeter o seu código como resposta dos exercícios. Na dúvida, consulte [estes slides sobre controle de versão com Git](https://docs.google.com/presentation/d/1QTLn7roYJw_Cfm_IWRL-KusmQgnlQ6YVG6ZWePLDIFQ/edit).

## Especificação

<!-- http://asciiflow.com/ -->

```
+---------------------+
|                     |
|    Fulano           |
|  +---------------+  |
|                     |
|  +---------------+  |
|  | Cumprimentar  |  |
|  +---------------+  |
|                     |
|    Alô, Fulano!     |
|                     |
+---------------------+

```

Seu app deve consistir de uma Activity, `matc89.exercicio1.MainActivity`, que deve conter os três elementos a seguir:

- uma caixa de texto, inicialmente vazia, com id `editNome`
- um botão, com id `btnCumprimentar` e texto `Cumprimentar`
- um rótulo, com id `labelMensagem` e texto inicial "Alô, Mundo!"

Comportamento esperado:

- Ao digitar um texto na caixa de texto e clicar no botão, o texto do rótulo deve mudar para "Alô, X!", trocando X pelo texto digitado na caixa de texto.
- O texto do rótulo e da caixa de texto não deve se alterar quando a tela é rotacionada.
