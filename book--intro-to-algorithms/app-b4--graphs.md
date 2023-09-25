# Appendix B.4 Graphs
### Directed Graphs (Digraphs)  
___Def: Directed Graphs (Digraphs)___: Define a graph $G$ as a pair $(V,E)$ such that:  
$\quad$ $V$ is a finite set with elements of all vertices of $G$. Denoted as the Vertex Set.  
$\quad$ $E$ is an __ordered__ binary relation on $V$ that represent the edges of $G$. Denoted as the Edge Set.  
$\quad$ Note: Self-loops, edges from a vertex to itself, are possible.

Graphical Notation: Directed Graphs are drawn such that vertices are drawn as circles while edges are drawn as arrows.

If $(u,v) \in E$, then $(u,v)$ ___incident from or leaves___ vertex $u$ and ___incidents to or enters___ vertex $v$.  
If $(u,v) \in E$, then vertex $u$ is ___adjacent___ to vertex $v$, denoted $u \to v$. If $(v,u) \notin E$, then vertex $v$ is not adjacent to vertex $u$.  

___Def: Out-Degree of a Vertex___: The number of edges leaving a vertex.  
___Def: In-Degree of a Vertex___: The number of edges entering a vertex.  

Given a directed graph $G_D=(V_D, E_D)$, the ___undirected version___ $G_E=(V_U, E_U)$ is $(u,v),(v,u)\in E_D \iff (u,v)\in E_U$ and $v \neq u$.  
___Def: Neighbor___: Two vertices that are adjacent in their undirected version.


### Undirected Graphs
___Def: Directed Graphs (Digraphs)___: Define a graph $G$ as a pair $(V,E)$ such that:  
$\quad$ $V$ is a finite set with elements of all vertices of $G$. Denoted as the Vertex Set.  
$\quad$ $E$ is an __unordered__ binary relation on $V$ that represent the edges of $G$. Denoted as the Edge Set.  
$\quad$ Note: Self-loops, edges from a vertex to itself, are possible.
Let $v_1,v_2 \in V$ and $e_1 \in E$. If $e_1 \equiv \{v_1, v_2\}$, then $e_1 \equiv \{v_2, v_1\}$.

Graphical Notation: Undirected Graphs are drawn such that vertices are drawn as circles while edges are drawn as lines.

If $\{u,v\} \in E$, we say that $\{u,v\}$ ___incident on___ on vertices $u$ and $v$.  
If $\{u,v\} \in E$, we say that $u$ and $v$ are ___adjacent___. For Undirected Graphs, this property is symmetric.  

___Def: Degree of a Vertex___: The number of edges incident on a vertex.  
Note: A vertex with degree 0 is said to be ___isolated___.  

Given a undirected graph $G_U=(V_U, E_U)$, the ___directed version___ $G_D=(V_D, E_D)$ is where $(u,v)\in E_U \iff(u,v),(v,u) \in E_D$.  
___Def: Neighbor___: Two vertices that are adjacent.

<div style="page-break-after: always"></div>

### Paths
A ___path___ from a vertex $u$ to a vertex vertex $u'$ in a graph $G$ is a sequence $[v_0, \dots, v_k]$ such that $u=v_0$, $u'=v_k$, and $(v_{i-1}, v_i) \in E$ for $i = 1, \dots, k$.  
The length of the path is value $k$.  
The path contains the vertices $v_0, \dots, v_k$ and edges $(v_0, v_1), \dots (v_{k-1}, v_k)$.  
Note: For all vertex $u$, there exists a 0-length path from $u$ to $u$.  
If there exists a path from $u$ to $u'$, we say that $u'$ is ___reachable___ from $u$ via path $p$.  
A path is ___simple___ if all vertices in the path are distinct.

A ___subpath___ is a subsequence of the vertices of path $p$.  
With $p=[v_0, \dots, v_k]$, if $\exists i,j \ni 0 \le i \le j \le k$, then the subpath $s = [v_i, \dots, v_k]$.

### Cycles
A graph with no cycle is acyclic.

Let $G$ be a directed graph and a path $p = [v_0, \dots, v_k]$, if $v_0 = v_k$ and the length of $p$ is at least one, then  $p$ is a cycle.  
$\quad$ Similar to a simple path, $p$ is a simple cycle if the elements are distinct.  
$\quad$ A directed graph is ___simple___ if there are no self-loops.  

Let $G$ be an undirected graph, a path $p$ $[v_0, \dots, v_k]$ forms a cycle if $k \ge 3$ and $v_0 = v_k$.


### Connectivity
> Recall: ___Equivalence Classes___ (Foundations of Mathematics)  
> Let $S$ be a nonempty set and let $R$ be a relation. For it to be an equivalence The following properties must hold:
> 1. Reflexivity $\forall x \in S, \space (x,x) \in R$
> 2. Symmetric $\forall(x,y) \in R, \space \exists(y,x) \in R$
> 3. Transitivity $\forall(x,y),(y,z) \in R, \space \exists(x,z)\in R$
> 
> When referring to the equivalence relation in terms of graphs, $S=V$, the vertex set, and $R=E$, the edge set.

Let $G$ be a directed graph.  
$G$ is considered to be ___strongly connected___ if every two vertices are reachable from each other.  
The ___strongly connected components___ of a directed graph are the equivalence classes of vertices under the "mutually reachable relation".  

Let $G$ be an undirected graph.  
$G$ is considered to be ___connected___ if every vertex is reachable from all other vertices.  
The ___connected components___ of a graph are the equivalence classes of vertices under the "is reachable" relation.

### Isomorphism
> Recall: ___Bijective Functions___ (Foundations of Mathematics)  
> A function $f:A \to B$ is said to be bijective (one-to-one) if $(x_1, x_2 \in A), \space f(x_1) \neq f(x_2)$

Two graphs $G=(V,E)$, $G'=(V',E')$ are ___isomorphic___ if there exists a bijection $f:V \to V'\ni (u,v) \in E \iff (f(u),f(v)) \in E'$.  

### Subgraphs
Given a graph $G=(V,E)$, we define $G'=(V',E')$ as a ___subgraph___ if $V' \subseteq V$ and $E' \subseteq E$.  
When given a set $V' \subseteq V$, the subgraph of $G$ ___induced___ by $V'$ is the graph $G'=(V', E') \ni E' =\{(u,v) \in E: u,v \in V' \}$.


## Special Graphs
___Def: Complete Graph___: An undirected graph in which every pair of vertices are adjacent.  
___Def: Bipartite Graph___: An undirected graph $G=(V,E)$ where $V$ is partitioned into $V_1, V_2 \ni (u,v) \in E \implies u \in V_1, v \in V_2 \text{ or } u \in V_2, v\in V_1$.  
___Def: Forest___: An acyclic, undirected graph.  
___Def: (Free) Tree___: A connected, acyclic, undirected graph.  
___Def: Dag___: A directed acyclic graph.  
___Def: Multi-graph___: An undirected graph that can contain multiple edges going from any two vertices or self-loops.  
___Def: Hypergraph___: Similar to an undirected graph with ___hyperedges___, edges that can connect an arbitrary subset of vertices.  
$\quad$ Visually, imagine a hyperedge as a space that envelopes multiple nodes.  
$\quad$ Many algorithms written for directed/undirected graphs can be adapted to run on a hypergraph.

## Contraction
___Def: Contraction of an Undirected Graph___:  
Given an undirected graph $G = (V,E)$.  
The contraction of $G$ by an edge $e = (u,v)$ is a graph $G' = (V',E')$ where,  
$\quad V' = V - \{u,v\} \cup \{x\}$ where $x$ is the vertex formed by joining the vertices $u$ and $v$.  
$\quad E' = E - \{e\} \cup E_X$ where $E_X$ is the edges formed by connecting all edges containing $u$,$v$ to $x$.  
Therefore, the effect is $u$ and $v$ being contracted into a single vertex.
