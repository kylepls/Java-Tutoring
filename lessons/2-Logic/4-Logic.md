####Logical Logic

#####And “&&”

    System.out.println(1==1 && 2==2);

Both must be true

##### Or “||”
    
    System.out.println(((1==2) || (3==3)));

One must be true

##### Not

The inverse

    System.out.println(!true);
    // false
    System.out.println(!(1==2));
    // true

#### Precedence

| Operators | Precedence |
| :---: | --- |
| postfix | expr++ expr--
| unary | ++expr --expr +expr -expr ~ !
| multiplicative | * / %
| additive | + -
| shift | << >> >>>
| relational | < > <= >= instanceof
| equality | == !=
| bitwise AND | &
| bitwise exclusive OR | ^
| bitwise inclusive OR | | |
| logical AND | &&
| logical OR | || 
| ternary | ? :
| assignment | = += -= *= /= %= &= ^= |= <<= >>= >>>=

https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html
