Spring Data Neo4j Sample Proejct
=================================

This is the sample project to demonstrate the stackoverflow issue

[How to modeling this relation in spring data neo4j?](https://stackoverflow.com/questions/46503104/how-to-modeling-this-relation-in-spring-data-neo4j?noredirect=1#comment80271367_46503104)

Here is the modeling diagram which used to introduce the relationship between the nodes.

![modeling](https://i.stack.imgur.com/nKsOV.png)

After the research, here is the solution indeed, all the classes are house in `sample.spring.data.neo4j` package, and the the corresponding test `sample.spring.data.neo4j.repositories.CompanyRepositoryTest`

The big issue at the beginning it always encountered the **StackOverFlow** which is due the the **lombok** annotation, after remove this and use the plain getter/setter, everything goes well.