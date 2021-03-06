(defproject core.typed "0.2.3-SNAPSHOT"
  :description "Gradual typing for Clojure"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/jvm.tools.analyzer "0.4.5"
                  :exclusions [org.clojure/clojure
                               org.clojure/clojurescript]]
                 [org.clojure/core.contracts "0.0.4"
                  :exclusions [org.clojure/clojure]]
                 [org.clojure/math.combinatorics "0.0.2"
                  :exclusions [org.clojure/clojure]]
                 [org.clojure/clojurescript "0.0-1859"]
                 [org.clojure/tools.trace "0.7.5"
                  :exclusions [org.clojure/clojure]]
                 [org.clojure/clojure "1.5.1"]
                 [org.clojure/tools.namespace "0.2.4"]
                 [org.clojure/tools.macro "0.1.0"] ;for algo.monads
                 #_[net.intensivesystems/arrows "1.3.0"
                    :exclusions [org.clojure/clojure]] ;for testing conduit, lein test wants it here?
                 [com.taoensso/timbre "2.1.2"]
                 [org.clojure/core.match "0.2.0-alpha12"]
                 [org.clojure/core.async "0.1.222.0-83d0c2-alpha"]
                 ]

  :global-vars {*warn-on-reflection* true}

  :repositories {"sonatype-oss-public" "https://oss.sonatype.org/content/groups/public/"}

  :source-paths ["src/main/clojure"
                 "src/main/cljs"
                 #_"../clojurescript/src/clj" 
                 #_"../clojurescript/src/cljs"]
  :test-paths ["src/test/clojure"
               "src/test/cljs"]

  :profiles {:dev {:repl-options {:port 64394}}}

  :cljsbuild {:builds {}}

  :dev-dependencies [])
