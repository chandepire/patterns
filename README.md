# design pattern
## 1. 策略模式

> 策略模式定义了算法族，分别封装起来，让它们之间可以互相替换，此模式让算法的变化独立于使用算法的客户。

在v1版本中，因为仅仅是在Duck类的代码中做了局部修改，即添加了一个fly方法，就影响了继承Duck类的一个子类（橡皮鸭）； 当然，可以针对橡皮鸭中的fly方法进行重写，然后在其中什么也不做。但是如果后面出现新类型的鸭子，且存在其特有的行为方式，那么就需要对于所有的子类的新增行为都要进行重写，这样对于代码的扩展性和可维护性不够友好。

当然，可以将需要变化的行为，如叫声和飞行方式，都抽离出来，作为接口，用于被子类进行实现，虽然这样可以解决一部分问题，可这样导致了对应的代码不能被复用，从而导致应用的重复代码变多。

因此，这里我们要用到三个设计原则：

> 1. 找出应用中可能需要变化的地方，把它们独立出来，不要和那些不需要变化的代码混在一起。
> 2. 针对接口编程，而不是针对实现编程
> 3. 多用组合，少用继承

所以，基于上述的原则，我们开发了v2的版本。