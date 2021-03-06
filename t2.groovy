package javaposse.jobdsl.plugin.GeneratedJobsAction;

import lib.LayoutTagLib

def l=namespace(LayoutTagLib)
def t=namespace("/lib/hudson")

def allJobs = my?.findAllGeneratedJobs()
if (allJobs != null) {
    l.table() {
        t.summary(icon:"folder.png") {
            raw("Generated Jobs:")
            ul(class:"jobList") {
                allJobs.each { af ->
                    li() {
                        a(href:"${rootURL}/job/${af.jobName}/", class:"model-link tl-tr") { raw(af.jobName) }
                    }
                }
            }
        }
    }
}

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