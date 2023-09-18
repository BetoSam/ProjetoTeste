#Author: jsabsam_lb@homail.com

@cadastro
Feature: Realizar casdatro de alunos
Como usuario 
Quero acessar 
Para ralizar um cadastro de aluno 

  Background:
  Given que esteja na pagina de login 
  
  Scenario: validar cadastro de aluno valido
  When digitar o nome 
  And digitar   email 
  And digitar  senha 
  And digitar telefone 
  And digitar cpf
  And digitar especialidade
  And profissao
Then o cadastro devera ser realizado com sucesso 