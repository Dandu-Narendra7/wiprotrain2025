function separateFirstRest(...args) {
  const [first, ...rest] = args;
  return { first, rest };
}
