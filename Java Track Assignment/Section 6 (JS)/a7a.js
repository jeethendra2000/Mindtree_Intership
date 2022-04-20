const person = {
    firstName: "Nick",
    lastName: "Anderson",
    age: 35,
    sex: "M"
}

const { firstName: first, age, city = "Paris" } = person; // That's it !

console.log(age)
console.log(first)
console.log(person.firstName)
console.log(city)
