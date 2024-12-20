// node.js를 설치했다면 `node script.js`으로 실행 가능


// Object 선언
// name: "haley",
// food: "pizza", 
// age: 20, 

const myObject = { 
  // 코드를 입력해보세요.
  name:"haley",
  food: "pizza",
  age:20  
}

// Object to JSON - stringfy()
// JSON.stringfy(Object)
const objToJson = JSON.stringify(myObject)

                              // 어떤 값들이 출력될지 맞춰보세요.
console.log(objToJson)        // {"name": "haley", "food": "pizza", "age":20}
console.log(typeof objToJson) // {string}
console.log(objToJson.age)    // undefined
console.log(objToJson[0])     // 


// JSON to Object - parse()
// JSON.parse(JSON)
const jsonToObj = JSON.parse(objToJson)
                                  // 어떤 값들이 출력될지 맞춰보세요.
console.log(jsonToObj)            // {name: "haley", food: "pizza", age:20} // <- JSON -> Object 변환했을 때
console.log(typeof jsonToObj)     // Object
console.log(typeof jsonToObj.age) // number
console.log(jsonToObj["age"])     //