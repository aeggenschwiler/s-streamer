def BigInteger numLines = args[0] as BigInteger
println "iLine,first,last"
for (BigInteger i = 1; i < numLines+1; i ++) {
  println String.format ("%d,f%d,l%d",i,i,i)}
