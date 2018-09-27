import static java.lang.String.format 

class SomeClass {

    String format(Integer i) { 
        i.toString()
    }

    static void main(String[] args) {
        assert format('String') == 'String' 
        assert new SomeClass().format(Integer.valueOf(1)) == '1'
    }
}

int fib(int n) {
    n < 2 ? 1 : fib(n-1) + fib(n-2)
}
assert fib(10)==89

println 'Hello'                                 

int power(int n) { 2**n }                       

println "2^6==${power(6)}" 

import org.codehaus.groovy.runtime.InvokerHelper
class Main extends Script {
    int power(int n) { 2** n}                   
    def run() {
        println 'Hello'                         
        println "2^6==${power(6)}"              
    }
    static void main(String[] args) {
        InvokerHelper.runScript(Main, args)
    }
}