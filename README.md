# flouci-test
challenge recap:

must have
- spring boot
- rest
- rabbitmq
- redis
- db migration: liquibase

optional
+ git flow
+ security
+ jsp
+ ci/cd
+ camunda
----------------------

apps dependencies + actions:

app 1 : sender
web
H2 db
task table
liquibase
+ test
  action: send task  with rest

app 2: reciever
web
+ redis
+ test
  action: recieve task
  action: calculation (process) (camunda)
  action: return result (rabbitmq)


++documentation: swagger

-------------------

steps:

- define app basic dependencies - ok
- spring init - ok
- create github project - ok
- push v0 to main - ok
- issues first redaction - ok
    - Set liquibase script for H DB migration
    - Add Thymeleaf task table
    - Bind task table actions to REST API
    - Recieve task - cachable action
    - Add calculation process
    - Insert calculation results in Rabbitmq queue + set listener
- create PRs per issue
- create Trello board (optional)

----------
