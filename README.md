# singtelIntv
This is a maven project pls do mvn clean install as required.


**1. Can you implement the sing() method for the bird?**
- **How did you unit test it?**
In unit test, System.setOut to an byteArrayOutputStream and assert on this byteArrayOutputStream
- **How did you optimize the code for maintainability?**
As sing and fly is special operation for the Bird objects, this has been extracted out as corresponding FlyingAnimal and SingingAnimal

**2. Now, we have 2 special kinds of birds: the Duck and the Chicken... Can you
implement them to make their own special sound?**
A field "sound" is introduced in the Animal object with default value as null to represent the sound made by different animal. A method make sound is also added to Animal
- **A duck says: “Quack, quack”**
In Duck constructor, set sound to “Quack, quack”
- **A duck can swim**
Duck extends Bird and implements SwimmingAnimal
- **A chicken says: “Cluck, cluck”**
In Duck constructor, set sound to “Cluck, cluck”
- **A chicken cannot fly (assumption: its wings are clipped but ignore that)**
In Chicken class, overwrite the fly method and return false.

**3. Now how would you model a rooster?**
Rooster is a male chicken. Add a gender field in Animal class with default value as UNKNOWN
- **A rooster says: “Cock-a-doodle-doo”**
Overwrite the makeSound method, If the gender of the chicken is MALE, return “Cock-a-doodle-doo”. Else return “Cluck, cluck”. Assumption is in all the chickens, only rooster will make sound “Cock-a-doodle-doo”
- **How is the rooster related to the chicken?**
Rooster is a chicken
- **Can you think of other ways to model a rooster without using inheritance?**
Rooster object is made by creating a new Chicken object with gender as male

**4. Can you model a parrot? We are specifically interested in three parrots, one that
lived in a house with dogs one in a house with cats, the other lived on a farm next to
the rooster.**
- **A parrot living with dogs says: “Woof, woof”**
- **A parrot living with cats says: “Meow”**
- **A parrot living near the rooster says: “Cock-a-doodle-doo”**
- **How do you keep the parrot maintainable? What if we need another parrot lives near a Duck? Or near a phone that rings frequently**
Parrot is made with a constructor accepting a String sound. This will create Parrots objects with different sounds.

**B. Model fish as well as other swimming animals**
- **In addition to the birds, can you model a fish?**
- **Fishes don’t sing**
- **Fishes don’t walk**
- **Fishes can swim**
New class Fish is created extends Animal and implements SwimmingAnimal

**2. Can you specialize the fish as a Shark and as a Clownfish?**
- **Sharks are large and grey**
- **Clownfish are small and colourful (orange)**
- **Clownfish make jokes**
- **Sharks eat other fish**
New fields: size and color created in the Animal class. getter also provided for those attributes. 
New class Sharks and Clownfish is createad. In each constructor, set the size and color in Animal to respective attributes.
New method makeJokes and eat is created in Clownfish and Shark respectively to avoid the creation of interfaces that cant be share among the currents class

**3. Dolphins are not exactly fish, yet, they are good swimmers**
- **Can you model a dolphin that swims without inheriting from a fish class?**
- **How do you avoid duplicating code or introducing unneeded overhead?**
New class Dolphin created extends Animal and implements SwimmingAnimal

**D. Model animals that change their behaviour over time**
- **Can you model a butterfly?**
- **A butterfly can fly**
- **A butterfly does not make a sound**
- **Can you optimize your model to account for the metamorphosis from caterpillar to
butterfly?**
- **A caterpillar cannot fly**
- **A caterpillar can walk (crawl)**
New class Butterfly created extends Animal and implements FlyingAnimal. 
Add new field in Butterfly name stage. Depends on each stage, the Butterfly object can fly or walk.

**Suppose you have an array of animals, e.g.**
**Animal[] animals = new Animal[]{**
 **new Bird(),**
 **new Duck(),**
 **new Chicken(),**
 **new Rooster(),**
 **new Parrot(),**
 **new Fish(),**
 **new Shark(),**
 **new Clownfish(),**
 **new Dolhpin(),**
 **new Frog(),**
 **new Dog(),**
 **new Butterfly(),**
 **new Cat()**
**};**
Note: The above instantiation may be different if you chose to set up your object model
differently… (hopefully you did)
- **Can you share the code to count:**
- **how many of these animals can fly?**
- **how many of these animals can walk?**
- **how many of these animals can sing?**
- **how many of these animals can swim?**

To run the count animal application, please run CountAnimal.

Note the animal arrays is created differently as above.

Count Animal can fly by filter out animal objects which is an instance of FlyingAnimal and the fly() return true.

Count Animal can fly by filter out animal objects which is an instance of WalkingAnimal and the walk() return true.

Count Animal can fly by filter out animal objects which is an instance of SwimmingAnimal.

Count Animal can fly by filter out animal objects which is an instance of SingingAnimal.

Assumption is all objects inherited from Bird class can sing except stateed otherwise
