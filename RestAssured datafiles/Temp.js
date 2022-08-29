const arrOne = [17, 21, 23];
const arrTwo = [12, 5, -5, 0, 4];
function printForeCast(array) {
  let str = "";
  for (let index = 0; index < array.length; index++) {
   // str += `${array[index]}℃ in ${index + 1} days...`;
    str = str + `${array[index]}℃ in ${index + 1} days...`;
  }
  console.log("..." + str);
}
printForeCast(arrTwo);


const trail = function Demo(){
   //
}

const jetsasi = ( birthYear,Name) => 
{ let num = 2022 - birthYear
    return`${Name} is current age is ${num} `}
console.log(jetsasi(1999,"Loki"))
   // Arrow function
   