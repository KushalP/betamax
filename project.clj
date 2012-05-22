(defproject betamax "0.1.0-SNAPSHOT"
  :description "Mock out clj-http with style"
  :url "http://github.com/wjlroe/betamax"
  :license {:name "MIT"
            :url "http://www.opensource.org/licenses/mit-license.php"}
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [clj-http "0.4.1"]]
  :profiles {:dev {:dependencies [[midje "1.4.0"]]}})