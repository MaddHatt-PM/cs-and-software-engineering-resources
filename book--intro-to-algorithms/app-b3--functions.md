# B.3 Functions
Given two sets $A$ and $B$, a function $f$ is a binary relation on $A$ and $B$ such that $(\forall a \in A) (\exists b \in B \ni (a,b) \in f \text{ and } (a,b) \text{ is distinct})$.  
___Def: Domain___: The set of all inputs that $f$ operates.  
___Def: Codomain___: The set of all outputs that $f$ can return.  
$\quad$ Note: While the ___range___ of $f$ is the actual output values of $f$, the codomain is the __set__ of all possible outputs.  
Notation: We write $f: A \to B$.  
Notation: If $(a,b) \in f$, we write $b=f(a)$ as $b$ is uniquely determined by the choice of $a$.  

The function $f$ assigns an element of $B$ to each element of $A$.  
As no element of $A$ is assigned two different elements of $B$, the same element of $B$ can be assigned to different elements of $A$.  

Given a function $f: A \to B$, if $f(a) = b$, then we says that $a$ is the ___argument___ of $f$ and $b$ is the ___value___ of $f$ at $a$.  
Two functions $f$ and $g$ are ___equal___ if they have the same domain and codomain, if for all $a$ in the domain, $f(a)=g(a)$.

## Sequences
A ___finite sequence___ of length $n$ is a function $f$ whose domain is the set of $n$ integers $\{0,1,\dots, n-1\}$.  
A finite sequence is denoted by listing its values: $\langle f(0), f(1), \dots, f(n-1) \rangle$.

An infinite sequence is a function whose domain is the set of natural numbers $\mathbb{N}$.  
$\quad$ Ex: The Fibonacci sequence defined by recursion, is the infinite sequence $\langle 0,1,1,2,3,5,8, 13,21, \dots \rangle$.

## Functions of Cartesian Products
Notation: When a domain of a function $f$ is a Cartesian product, the extra parentheses of the argument are omitted.  
$\quad$ Ex: Let $f: A_1 \times \cdot\cdot\cdot \times A_n \to B$, we write $b=f(a_1, \dots, a_n)$ and __not__ $b=f((a_1, \dots, a_n))$.  
Note: Each argument $a_i$ is called an argument even though the only single argument of $f$ is the $n$-tuple $(a_1, a_2, \dots, a_n)$.


## Images
If $f:A \to B$ is function and $b = f(a)$, then we can say that $b$ is the ___image___ of $a$ under $f$.  
The image of a set $A' \subseteq A$ under $f$ is defined by $f(A') = \{b \in B: b = f(a) \text{ for some } a \in A'\}$.  
The ___range___ of $f$ is the image of its domain, $f(A)$.  
$\quad$ Ex: If $f: \mathbb{N} \to \mathbb{N}$ defined by $f(n) = 2n$,  
$\qquad\:$ then the range is $f(\mathbb{N}) = \{m : m = 2n \ni \exists n \in \mathbb{N}\}$, the set of nonnegative even integers.

<div style="page-break-after: always"></div>

## Types of Function
A function is a ___surjection___ if its range is its codomain.  
$\quad$ Ex: $f(n) = \lfloor n/2 \rfloor$ is a surjective function $\mathbb{N} \to \mathbb{N}$ as every element in $\mathbb{N}$ appears as the value of $f$ for some argument.  
$\quad$ Counter: $f(n) = 2n$ is not surjective from $\mathbb{N}\to\mathbb{N}$ as $(a \in \mathbb{N})f(a)\neq3$.  
$\qquad\qquad\:$ However, $f(n) = 2n$ is surjective from $\mathbb{N} \to \{\text{Evens Naturals}\}$.  
___Def: Onto___: A function $f: A \to A$ that is surjective is also referred to as ___onto___, read as $f$ maps $A$ onto $B$.

A function $f: A \to B$ is an __injective___ if the distinct arguments to $f$ produce distinct values.  
$\quad$ Symbolically, If $a\neq a'$, then $f(a) \neq f(a')$.  
$\quad$ Ex: $f(n) = 2n$ is an injective function from $\mathbb{N}\to\mathbb{N}$ as no two arguments result in the same value.  
$\quad$ Counter: $f(n) = \lfloor n/2 \rfloor$ as $f(2) = f(3) = 1.$  
___Def: One-to-One___: A function $f: A \to B$ that is injective is also referred to as ___one-to-one___.

A function $f: A \to B$ is a ___bijection___ if it is injective and surjective (one-to-one and onto).  
$\quad$ $f=(n) = (-1)^n \lceil n/2 \rceil$ is a bijection from $\mathbb{N}\to\mathbb{Z}$.  
$\quad$ The function injective (one-to-one) as no element of $\mathbb{Z}$ is the result of more than one element of $\mathbb{N}$.  
$\quad$ The function subjective (onto) as every element of $\mathbb{Z}$ appears as the result of some element $\mathbb{N}$.  

A bijective function is sometimes called a ___one-to-one correspondence___ as it pairs elements in the domain with the codomain.  
A bijection from a set $A$ to itself is sometimes called a ___permutation___.

When a function $f$ is bijective, the inverse $f^{-1}$ is defined as $f^{-1}(b) = a$  if and only if $f(a) = b$.