# design_pattern
design pattern example by java

设计模式：

一.简单工厂模式（factory）
   计算器功能，利用 继承、封装、多态 。简单工厂实例。运算类作为父类，被其他方法类继承，通过简单工厂类来构建对应的运算类。

二.策略模式（strategy）
策略模式定义了算法家族，分别封装起来，让他们之间可以互相替换，此模式让算法的变化，不会影响到使用算法的客户。

三.单一职责原则(SRP)
就一个类而言，应该只有一个引起它变化的原因
软件设计真正要做的许多内容，就是发现职责并把那些职责相互分离 
如果你能想到多于一个的动机去改变一个类，那么这个类就具有多余一个的职责

四.开放-封闭原则
软件实体（类、模块、函数等等）应该可以扩展，但是不可修改。

五.依赖倒转原则（依赖倒置原则）
抽象不应该依赖细节，细节应该依赖于抽象。（针对接口编程，不要针对实现编程）
里氏替换原则（LSP）:子类型必须能够替换调他们的父类型。
