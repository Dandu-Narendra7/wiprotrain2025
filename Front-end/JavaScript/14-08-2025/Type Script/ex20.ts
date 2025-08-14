function pair<T, U>(first: T, second: U): [T, U] {
  return [first, second];
}
const result1 = pair<number, string>(42, "hello");
console.log(result1);