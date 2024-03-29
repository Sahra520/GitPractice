package day45_OOP_AbstractionContinue_Interface;

public class day45_classNotes {

    /*

Page
1
of 3
Java Day45
Topics: OOP Abstraction Continue:
Interface,
Interface vs Abstract class
extends vs implements
package name: day45_Abstraction
class: blueprint of objects
   specifies what the object MUST have
   can be instantiated
   can be final
abstract class: meant to be parent
    can have abstract method
    can not be instantiated
    can not be final
    MUST contain the common features of all
the subclasses
interface: blueprint of class
   specifies what the class(es) must have
   can not be instantiated
   can not be final
   to provide additional methods that any class needs
   What interface can have?
   variables:final static variables
ONLY
   methods: abstract method, default
method, static method
   Access modifier: public ONLY
   what interface can not have?
   Instance variable
   Instance methods
   Constructor
   Blocks
   private, deafult, protected access
mdofiers
   why we need interface?
   one class can extend one class
ONLY
   one class can implements multiple
interfaces
   (Multiple inheritance
is allowed)
   100% abstraction
Abastract class vs interface: both are used for achieving abstraction

both can not be instantiated

both can not be final

both are meant to be inherited
  abstract class: one class can extends one
abstract class
  can
have instances & statics
  can
have constructor
  4
access mdofiers
  interface: one class can implement multiple
interfaces
extends vs implements: both are used for inheritance
extends:
class extends class
interface extends interface(s)
implements:
class implements interface(s)
extends & implements:
extends first then implements
interface AutoPark:
autoPark();
interface AutoPilot extends AutoPark
selfDriver();
interface SearchContext:
findElement();
findElements();
interface WebDriver extends SearchContext:
get()
close()
Remaining topics:
Polymorphism
Collection
Map
Enum
Generics
Functional Interface
Lambda Expressions
Stream
     */
}
