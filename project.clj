(defproject cljs-intro "1.0.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [domina "1.0.0"]
                 [org.clojure/clojurescript "0.0-3211"
                  :exclusions [org.apache.ant/ant]]
                 [compojure "1.1.6"]
                 [hiccup "1.0.4"]]
  :plugins [[lein-cljsbuild "1.1.4"]
            [lein-ring "0.8.7"]]
  :source-path ["src/clj"]
  :cljsbuild {
    :builds [{ :source-path “src-cljs”
               :compiler { :output-to “resources/public/js/main.js”
                           :optimization :whitespace
                           :pretty-print true }}]}
  :ring {:handler skilbjo.routes/app})
