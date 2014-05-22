import patmat.Huffman
import patmat.Huffman.{Leaf, Fork}

val l = List('1', '2', '1', '3')
l.flatMap(x => if (x.equals('1')) List(x) else Nil).size

val t1 = Fork(Leaf('a', 2), Leaf('b', 3), List('a', 'b'), 5)
val list = Huffman.times(List('1', '2', '1', '3'))

val l1 = Huffman.makeOrderedLeafList(list)
Huffman.singleton(l1)

Huffman.combine(l1)

Huffman.until(Huffman.singleton, Huffman.combine)(l1)

Huffman.createCodeTree(l)

Huffman.decodedSecret
val tt1 = Fork(Leaf('a', 2), Leaf('b', 3), List('a', 'b'), 5)
val bits = Huffman.encode(tt1)(List('a', 'b'))
Huffman.decode(tt1,bits)

val bits2 = Huffman.quickEncode(tt1)(List('a', 'b'))
Huffman.decode(tt1,bits2)