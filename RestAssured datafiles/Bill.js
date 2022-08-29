const bills = [22, 295, 176, 440, 37, 105, 10, 1100, 86, 52];
const tips = [];
const totalValue = [];
function caluTip(billValue) {
  const tip =
    billValue <= 300 && billValue >= 50 ? billValue * 0.15 : billValue * 0.2;
  return tip;
}
for (let value = 0; value < bills.length; value++) {
  tips.push(caluTip(bills[value]));
  totalValue.push(tips[value] + bills[value]);
}
console.log(bills);
console.log(tips);
console.log(totalValue);

function avgArray(tipAverage){
    let sum = 0
    for  (let value = 0 ; value<tipAverage.length; value++){
        sum = sum + tipAverage[value];
    }
    console.log(`The average of Tip Value is ${sum/tipAverage.length}`)

}
 avgArray(tips);