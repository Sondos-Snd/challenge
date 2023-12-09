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

- define app basic dependencies
- spring init
- create github project
- push v0 to main
- issues first redaction
- create first PR
- create Trello board

----------
