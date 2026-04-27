let pre2 =0;
let pre1=1;
console.log(pre2);
console.log(pre1);
for(let i=0;i< 18;i++){
    let newFibo =pre2+pre1;
    console.log(newFibo);
    pre2=pre1;
    pre1=newFibo;
}