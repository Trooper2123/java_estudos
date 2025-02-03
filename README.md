# java_estudos

#CASO 1

É necessário criar os testes de unidade necessários para abranger o comportamento da camada StudentDAO e StudentRepository. Leve em conta vários cenários e "casos extremos" de cada comportamento.

- [ ] Casos nulos, vazios e inválidos.
- [ ] Adicionar um aluno.
- [ ] Procurar um aluno por ID.
- [ ] Modificar os dados de um aluno.
- [ ] Excluir um aluno.
- [ ] Listar todos os alunos.

#CASO 2

É necessário criar os testes de unidade necessários para cobrir o comportamento da camada de serviço ObtenerDiplomaService. Leve em conta vários cenários e "casos extremos" de cada comportamento.

- [ ]Casos nulos, vazios e inválidos.
- [ ]Dados de saída idênticos aos dados de entrada.
- [ ]Cálculo da média.
- [ ]Legenda do diploma.
- [ ]Mensagem de diploma com honras.

##Etapas de teste unitárias com Mocks

Crie o mock IStudentDAO.
Injete-o no ObtenerDiplomaService.
Configure seu comportamento (configuração) com o método when.
Execute o teste com um nome dos casos de borda e use os asserts correspondentes.

#CASO 3

É necessário criar os testes de unidade necessários para cobrir o comportamento da camada de serviço do StudentService, mockeando com os repositórios.

Etapas de teste unitárias com Mocks

- [ ]Crie a simulação IStudentDAO.
- [ ]Crie a simulação IStudentRepository.
- [ ]Injete-os no StudentService.
- [ ]Configure seu comportamento (configuração) com o método when.
- [ ]Execute o teste com um nome dos casos de borda e use as afirmações correspondentes.

#CASO 4

Se requiere crear los tests unitarios necesarios para cubrir el comportamiento de la capa de controlador ObtenerDiplomaController, mockeando su dependencia con el servicio.

Etapas de teste unitárias com Mocks

- [ ]Crie o IObtenerDiplomaService simulado.
- [ ]Injete-o no GetDiplomaController.
- [ ]Configure seu comportamento (configuração) com o método when.
- [ ]Execute o teste com um nome dos casos de borda e use as afirmações correspondentes.

#CASO 5

É necessário criar os testes de unidade necessários para cobrir o comportamento da camada do controlador StudentController, mockeando sua dependência do serviço.

Etapas de teste unitárias com Mocks

 - [ ]Crie o mock IStudentService. 
 - [ ]Injete-o no StudentController.
 - [ ]Configure seu comportamento (configuração) com o método when.
- [ ]Execute o teste com o nome dos casos de borda e use as afirmações correspondentes.