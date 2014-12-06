(defproject env-setup "0.1.0-SNAPSHOT"
  :description "An example app using log4j and environ"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/tools.logging "0.3.1"]
                 [log4j/log4j "1.2.17" :exclusions [javax.mail/mail
                                                    javax.jms/jms
                                                    com.sun.jdmk/jmxtools
                                                    com.sun.jmx/jmxri]]
                 [environ "1.0.0"]]
  :plugins [[lein-environ "1.0.0"]]
  :profiles {:dev        {:jvm-opts ["-Dlogfile.path=development"]
                          :env {:clj-env :development}}
             :test       {:jvm-opts ["-Dlogfile.path=test"]
                          :env {:clj-env :test}}
             :production {:jvm-opts ["-Dlogfile.path=production"]
                          :env {:clj-env :production}}}
  :main env-setup.core)
