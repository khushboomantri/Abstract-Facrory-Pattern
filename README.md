# Abstract-Facrory-Pattern

NAME: KHUSHBOO MANTRI

Class Name: VideoGame.java is the main file.VideoGame.java asks FactoryMaker.java to implement concrete classes. 
And FactoryMaker.java uses Abstractfactory.java To create Leader, Fortress and Army.
HumanArmy.java and RobotArmy.java implements Army.java class. HumanLeader.java RobotLeader.java implements Leader.java class. 
HumanFortess.java and RobotFortess.java implements Fortess.java




• AbstractFactory: Declares an interface for operations that generate abstract product objects
• ConcreteFactory: Implements the operations to form concrete product objects
• AbstractProduct: Declares an interface for a kind of product object
• ConcreteProduct: Defines a product object to be generated by the corresponding concrete factory.Implements the AbstractProduct interface
• Client: Uses only interfaces indicated by AbstractFactory and AbstractProduct classes

