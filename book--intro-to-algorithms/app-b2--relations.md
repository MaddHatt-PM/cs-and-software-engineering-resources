# Appendix B.2 Relations
A ___Binary Relation___ $R$ on two sets $A$ and $B$ is a subset of the Cartesian product $A \times B$, symbolically as $ R \subseteq A \times B$.  
If $(a,b) \in R$, we sometimes write $a\space R \space b$.  
When we say $R$ is a binary relation on a set $A$, we mean that $R \subseteq A \times A$.  
Ex: let $R$ be the "$\le$" relation on $\N$, so $R = \{(a,b) \in \N\times\N : a < b\}$.  

A binary relation $R \subseteq A \times A$, is ___reflexive___ if $(a,a) \in R$.  
    $\quad$ Ex: The "$=$" and "$\le$" are reflexive relations on $\N$ but "$<$" is not.  
A binary relation $R$ is ___symmetric___ if $(a, b) \in R \implies \exists(b,a) \in R$.  
    $\quad$ Ex: The "$=$" is symmetric relation, but "$\le$" and "$<$" are not.  
A binary relation $R$ is ___transitive___ if $(a,b), (b,c) \in R \implies (a,c) \in R$.  
    $\quad$ Ex: The relations "$=$", "$\le$", and "$<$" are transitive.  
    $\qquad\:$ The relation $R = \{(a,b) : a,b \in \N \text{ and } a = b- 1 \}$ is not transitive as $3\:R\:4$ and $4\:R\:5$ do not imply $3\:R\:5$.

A relation $R$ that is reflexive, symmetric, and transitive is an ___equivalence relation___.  
If $R$ is an equivalence relation on a set $A$, then for $a \in A$, the ___equivalence class___ of $a$ is $[a] = \{b \in A: a\:R\:b\}$, or the set of all elements equivalent to $a$.

### Theorem: An Equivalence Relation is the Same as a Partition
$(1)$ Let the equivalence classes of any equivalence relation $R$ on a set $A$ form a partition of $A$.  
$(2)$ Any partition of $A$ determines an equivalence on A for which the sets in the partition are the equivalence classes.  

### Proof:
> $(1)$ Equivalence classes of any relation $R$ on a set $A$ form a partition of $A$  
We must show that the equivalence classes are nonempty, pairwise disjoint sets whose union is $A$.  
As $R$ is reflexive, $a\in [a]$ so the equivalence classes are nonempty.  
Further, as $\forall a \in A$ belongs to the equivalence class $[a]$, the union of all equivalence classes is $A$.  
To show that the equivalence classes are pairwise disjoint, if $[a],[b]$ have an element c in common, they are the same set.  
Suppose that $aRc$ and $bRc$.  
By the symmetry and transitivity property of equivalence relations, $aRb$.  
Thus, $\forall x \in [a]$, we have that $xRa$.  
By transitivity, $xRb$.  
Thus $[a] \subseteq [b]$ and that $[b] \subseteq[a]$.  
It follows that $[a] = [b]$.  
$\therefore$ An equivalence class of a set $A$ is also a partition of $A$. 

> $(2)$ Any partition of $A$ determines an equivalence on A for which the sets in the partition are the equivalence classes.  
Let $\mathcal{A}$ = \{A_i\} be a partition of $A$ and define $R = \{(a,b) : \exists i \ni a \in A_i \text{ and } b\in B_i \}$.  
Suppose that $R$ is an equivalence relation $A$, so we must prove the three qualitites of equivalence relations.  
$\quad$ Reflexivity: Since $a\in A_i \implies aRa$.  
$\quad$ Symmetry: If $aRb, then $a$ and $b$ are in the same set $A_i$, so $bRa$.  
$\quad$ Transitivity: If $aRb$ and $bRc$, then all three elements must be in the same set $A_i$.  
As the three properties of equivalence relations are satisfied,  
$\therefore$ A partition of $A$ is also an equivalence class of a set $A$.

## Partial Order
A binary relation $R$ on a set $A$ is ___antisymmetric___ if $aRb$ and $bRa$ implies $a=b$.  
$\quad$ Ex: The $\le$ relation on $\N$ is antisymmetric, since $a \le b$ and $b \le a$ implies $a=b$.  
A relation that is reflexive, antisymmetric, and transitive is a ___partial order___.  
The set that a partial order is defined on is a ___partially ordered set___.

In a partial ordered set $A$, there may be no single ___maximal___ element from the relation $R$.  
Instead, there may be several maximal elements.  
$\quad$ Ex: A collection of different-sized boxes may have multiple maximal boxes that don't fit inside any other box.

## Total Relation
A relation $R$ on a set $A$ is a ___total relation___ if $\forall a,b \in A$, we have $aRb$, $bRa$, or both, with every pairing of elements of $A$ is related by $R$.  
$\quad$ Ex: The relation "$\le$" is a total order on the natural numbers.  
$\qquad\:$ The relation "is a descendant of"  is not a total order on the set of all people as two individuals may not be descendants from one or the other.  
A partial order that is also a total relation is a ___total order___ or ___linear order___.  
A total relation that is transitive, but not reflexive and antisymmetric, is a ___total preorder___.