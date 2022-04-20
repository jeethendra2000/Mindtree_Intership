class Animal {
    constructor(legs) {
        this.legs = legs;
    }
    walk() {
        console.log('walking on ' + this.legs + ' legs');
    }
    static helloWorld() {
        console.log('Hello World');
    }
}

class Bird extends Animal {
    fly() {
        console.log('flying');
    }
}
Bird.helloWorld();

myanimal = new Animal("Four");
myanimal.walk();

myfly = new Bird("Parrot");
myfly.fly();
