public class del {
    public static void main(String[] args) {

  data = new Array (1,2,3,4,5);
  sum_loop = function (arr) {
  total = 0;
  for (var i = arr.length - 1; i >= 0; i--) {
    total = total + arr[i];
  }
  console.log ("Using loop, total = " + total);
  }
  sum_loop(data);
 }
}
