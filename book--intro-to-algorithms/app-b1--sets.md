# Appendix B.1 Sets - Condensed Notes
___Def: Set___: A collection of distinct __members__ or __elements__.  
Notation: If an object $x$ is a member of set $S$, we write $x \in S$. 
$\quad$ Read "$x$ is a member of $S$" or "$x$ is in $S$"  
$\quad$ If $x$ is not a member of $S$, we write $x\not\in S$.  
We can describe a set explicitly using set notation, example: $\{1,2,3\}$.  
Two sets $A$ and $B$ are are ___equal___, written $A=B$, if they contain the same elements.  
Note: Sets are unordered collections.  

Special Notation for frequently encountered sets:  
$\quad$ $\emptyset$ denotes the empty set, a set with no members.  
$\quad$ $\mathbb{Z}$ denotes the set of __integers__ $\{\dots, -2, -1, 0, 1, 2, \dots\}$  
$\quad$ $\mathbb{R}$ denotes the set of __real numbers__.  
$\quad$ $\mathbb{N}$ denotes the set of natural numbers $\{0, 1, 2, 3, \dots\}$  
$\qquad$ Note: Some mathematicians start the natural numbers with $0$ or $1$.

### Set Notation Reading
Let $A =\{a\in\mathbb{N} : a < 10 \text{ and } a \ge b \space (b \in \mathbb{N} \ni b = \lceil f(a)\rceil )\}$.  
This can be read as the set $A$ contains the natural numbers less than $10$ and greater than $b$ with $b$ being the ceiling of $f$ of $a$.  
This notation can be broken down into several components
1. The enclosing curly brackets $\{\space\}$ indicate a collection of elements of length of elements.
2. The variable declaration $a \in \mathbb{N}$ is used to declare the type of variable that is used.
3. The such-that operator, the colon, is used to separate the variable declaration from the conditions.  
    Note: The seperator may appear as a vertical bar | based on preference.
4. The conditions declaration segment can include multiple conditions and new variables.

### Subsets
___Def: Subset___: If $\forall x \in A \implies x \in B$, then we write $A \subseteq B$ (read as "$A$ is a ___subset___ of $B$").  
___Def: Proper Subset___: If $\forall x \in A \implies (x \in B) \land (A \neq B)$, then we write $A \subset B$.  
$\quad$ Note: The Empty Set $\emptyset$ is a subset of all sets.

### Set Operations
Given two sets $A$ and $B$, we can define new sets by applying ___set operations___.  
$\quad$ ___Union___: $A \cup B = \{\space x: x \in A \text{ or } x \in B \space\}$, the set of elements in either $A$ or $B$.  
$\quad$ ___Intersections___: $A \cap B = \{\space x : x \in A \text{ and } x \in B \space\}$, the set of elements in both $A$ and $B$.  
$\quad$ ___Difference___: $A-B = \{\space x: x \in A \text{ and } x \not\in B \space\}$, the set of elements in $A$ and not in $B$.

Set Operations must obey the following laws:  
$\quad$ ___Empty Set Laws:___  
$\qquad$ $A \cap \emptyset = \emptyset$,  
$\qquad$ $A \cup \emptyset = A$.  

$\quad$ ___Identity Laws:___  
$\qquad$ $A \cap A = A$,  
$\qquad$ $A \cup A = A$.  

$\quad$ ___Associative Laws:___  
$\qquad$ $A \cap (B \cap C) = (A \cap B) \cap C$,  
$\qquad$ $A \cup (B \cup C) = (A \cup B) \cup C$.  

$\quad$ ___Distributive Laws:___  
$\qquad$ $A \cap (B \cup C) = (A \cap B) \cup (A \cap C)$,  
$\qquad$ $A \cup (B \cap C) = (A \cup B) \cap (A \cup C)$.  

$\quad$ ___Absorption Laws:___  
$\qquad$ $A \cap (A \cup B) = A$,  
$\qquad$ $A \cup (A \cap B) = A$.  

$\quad$ ___DeMorgans Laws:___  
$\qquad$ $A - (B \cap C) = (A - B) \cup (A - C)$,  
$\qquad$ $A - (B \cup C) = (A - B) \cap (A - C)$.  


### The Universe and Complements
All sets are typically subsets of some larger set $U$, the ___universe___.  
Example: The set $A = \{1,2,3\}$ is a subset of the natural numbers or the integers.  
It may be crucial to define $U = \mathbb{N}$ or $U = \mathbb{Z}$ for clarity.  

Given a universe $U$, we define the ___complement___ of a set $A$ as $A' = U-A = \{\space x : x \in U \text{ and } x \not\in A \space\}$.  
For any set $A \subseteq U$, we have the following laws,  
$\quad$ $A'' = A$,  
$\quad$ $A \cap A' = \emptyset$,  
$\quad$ $A \cup A' = U$.  

We can rewrite DeMorgan's laws with set complements.  
For any two sets $A, B \subseteq U$, we define:  
$\quad$ $(A \cap B)' = A' \cup B'$,  
$\quad$ $(A \cup B)' = A' \cap B'$.


### Disjoint Sets
___Def: Disjoint___: Two sets $A$ and $B$ are ___disjoint___ if they have no elements in common, $A \cap B = \emptyset$.  
A collection $\mathbb{S} = \{S_i\}$ of nonempty sets forms a ___partition___ of a set $S$ if,  
$\quad$ 1. The sets are ___pairwise disjoint___, that is $(S_i, S_j \in \mathbb{S})(i\neq j) \implies S_i \cap S_j = \emptyset$,  
$\quad$ 2. The union of all sets of $\mathbb{S}$ is $S$. This is represented symbolically as, 
$$
S = \bigcup_{S_i \space \in \space\space \mathbb{S}} S_i.
$$
In other words, $\mathbb{S}$ forms a partition of $S$ if each element of $S$ appears in exactly one $S_i$ member of $\mathbb{S}$.  
Notation: Due to set theory rules, $\mathbb{S}$ is referred to as a collection and __not__ as a set of sets.  
Notation: The Big Union operator $\bigcup$ iterates through all set elements and unions them into a single set.  

### Counting
___Def: Cardinality (Size)___: The number of elements in a set, denoted as $|S|$.  
Note: The cardinality of the empty set $\emptyset = 0$.  
If the cardinality of a set is a natural number, then set is ___finite___, else it is ___infinite___.  
If an infinite set that can be put into a one-to-one correspondence with the natural numbers $\mathbb{N}$ is ___countably infinite___, else it is ___uncountable___.  
The integers $\mathbb{Z}$ are countably infinite while the reals $R$ are uncountable.

For any two finite sets $A$ and $B$, we have the identity $|A \cup B| = |A| + |B| - |A \cup B|$.  
We can deduce that $|A \cup B| \le |A| + |B|$.  
If $A$ and $B$ are disjoint, then $|A \cap B| = 0$, thus $ |A \cup B| = |A| + |B|$.  
If $A \subseteq B$, then $|A| \le |B|$.

A finite set of $n$ element is sometimes called an ___n-set___.  
A 1-set is called a ___singleton___.  
A subset of $k$ elements of a set is sometimes called a ___k-subset___.


### Power Sets
___Def: Power Set___: The set of all subsets of a set $S$, include the $\emptyset$ and $S$ itself is called the ___power set___ of $S$, denoted as $\mathcal{P}(S)$.  
Example: Let $S=\{a,b\}$, then $\mathcal{P}(S)= \Bigl\{\emptyset, \{a\}, \{b\}, \{a,b\} \Bigl\}$.


### Ordered Sets
Recall: Sets are unordered collections of elements.  
To get around this property, we can define an ___ordered list___ of numbers as nested sets.  
Example:
$$
\begin{aligned}
\text{set}(a,b,c) &\neq \text{set}(c,b,a)\\
\Bigl\{a, \{a,b\}, \{a,b,c\}\Bigl\} &\neq \Bigl\{c, \{c,b\}, \{c,b,a\}\Bigl\}.
\end{aligned}
$$


### Cartesian Product
___Def: Cartesian Product___: Given two sets $A$ and $B$, the Cartesian Product, denoted $A \times B $, is the set $\{(a,b): a \in A \text{ and } b \in B \}$.  
Example: $\{a,b\} \times \{a,b,c\} =$
$$
\Biggl\{
    \begin{array}{l}
        (a,a), (a,b), (a,c),\\[2px]
        (b,a), (b,b), (b,c)
    \end{array}
\Biggl\}
$$
When $A$ and $B$ are finite sets, the cardinality of the Cartesian product is $|A \times B| = |A| \cdot |B|$.  

The Cartesian product of $n$ sets $A_1, A_2, \dots, A_n$ is the set of ___n-tuples___.  
The cardinality of this product is $|A_1 \times A_2 \times \dots \times A_n| = |A_1| \cdot |A_2| \cdot\cdot\cdot |A_n|$ if all sets are finite.  

We denote an ___n-fold___ Cartesian product over a single set $A$ as $A^n = A_1 \times A_2 \times A_n$.  
The cardinality of this product $|A^n| = |A|^n$ if $A$ is finite.
