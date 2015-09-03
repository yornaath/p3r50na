(defproject p3r50na "0.1.0-SNAPSHOT"

  :description "FIXME: write description"

  :url "http://example.com/FIXME"

  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/clojurescript "1.7.48"]
                 [org.omcljs/om "0.9.0"]
                 [com.stuartsierra/component "0.2.3"]
                 [http-kit "2.1.18"]
                 [compojure "1.4.0"]
                 [javax.servlet/servlet-api "2.5"]
                 [ring/ring-devel "1.4.0"]
                 [ring/ring-core "1.4.0"]
                 [reloaded.repl "0.1.0"]
                 [hiccup "1.0.5"]]

  :plugins [[lein-less "1.7.5"]
            [lein-cljsbuild "1.1.0"]
            [lein-npm "0.6.1"]]

  :less {:source-paths ["src/p3r50na/less/"]
         :target-path "public/css/"}

  :cljsbuild {
    :builds [
      {:source-paths ["cljs/bookof5rinds"]
        :compiler {:main 'bookof5rinds.core
                   :output-to "public/js/bookof5rinds.js"
                   :optimizations :whitespace
                   :pretty-print true}}]}

  :main p3r50na.core

  :target-path "target/%s"

  :profiles {:uberjar {:aot :all}
             :dev {:plugins []
                   :dependencies []
                   :source-paths ["dev"]}})