var a = 1;
var b = 1;
var c;
for (var i = 0; i < 20; i++) {
    c = a + b;
    a = b;
    b = c;
    console.log(c);
}
