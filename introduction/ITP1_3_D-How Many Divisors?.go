package main
import "fmt"

func main() {
  var a, b, c int
  fmt.Scan(&a)
  fmt.Scan(&b)
  fmt.Scan(&c)
  n := 0
  for i:=a;i<=b;i++ {
    if c % i == 0 { n++ }
  }
  fmt.Println(n);
}
