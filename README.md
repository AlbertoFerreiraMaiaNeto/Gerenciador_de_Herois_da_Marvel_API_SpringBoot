# CONFIGURANDO O AWS CLI
Baixe o AWS CLI para seu SO de escolha.

![CLI](https://github.com/AlbertoFerreiraMaiaNeto/Gerenciador_de_Herois_da_Marvel_API_SpringBoot/blob/master/ImagensReadme/AWS%20CLI.png)

## APÓS BAIXAR E EXECUTAR O AWS CLI
Abra o Prompt de comando e digite: aws configure
Depois que digitar vai aparecer para inserir sua chave de acesso e a chave secreta

![Configure](https://github.com/AlbertoFerreiraMaiaNeto/Gerenciador_de_Herois_da_Marvel_API_SpringBoot/blob/master/ImagensReadme/aws%20configure.png)

## DEPOIS BAIXE O DYNAMODB DO SEU LOCAL ESCOLHIDO
Depois de baixar, execute na sua máquina.

![DynamoDB](https://github.com/AlbertoFerreiraMaiaNeto/Gerenciador_de_Herois_da_Marvel_API_SpringBoot/blob/master/ImagensReadme/db.png)

## AGORA ABRA O TERMINAL
Digite o caminho do diretorio da pasta do DynamoDB
Assim que estiver dentro da pasta digite: 

java -Djava.library.path=./DynamoDBLocal_lib -jar DynamoDBLocal.jar -sharedDb

E aparecerá isto na imagem abaixo:

![Terminal](https://github.com/AlbertoFerreiraMaiaNeto/Gerenciador_de_Herois_da_Marvel_API_SpringBoot/blob/master/ImagensReadme/javajar.png)

## DEPOIS DOS PASSOS ANTERIORES COM SUCESSO
Execute a API

![Exec](https://github.com/AlbertoFerreiraMaiaNeto/Gerenciador_de_Herois_da_Marvel_API_SpringBoot/blob/master/ImagensReadme/execAPI.png)


## E ESTARÁ PRONTO PARA TESTE NO POSTMAN

![Postman](https://github.com/AlbertoFerreiraMaiaNeto/Gerenciador_de_Herois_da_Marvel_API_SpringBoot/blob/master/ImagensReadme/PostmanTeste.png)

## DOCUMENTAÇÃO DO POSTMAN LINK: https://documenter.getpostman.com/view/14616826/TzJsexWZ

![PostmanDoc](https://github.com/AlbertoFerreiraMaiaNeto/Gerenciador_de_Herois_da_Marvel_API_SpringBoot/blob/master/ImagensReadme/postdoc.png)

## SWAGGER: http://localhost:8080/swagger-ui-heroes-reactive-api.html

![Swagger](https://github.com/AlbertoFerreiraMaiaNeto/Gerenciador_de_Herois_da_Marvel_API_SpringBoot/blob/master/ImagensReadme/SwaggerHero.png)
