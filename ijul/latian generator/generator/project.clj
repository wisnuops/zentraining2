(defproject generator "0.0.1-SNAPSHOT"
  :description "FIXME: write description"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [selmer "0.9.8"]
                 ]
  :javac-options ["-target" "1.6" "-source" "1.6" "-Xlint:-options"]
  :aot [generator.core]
  :main generator.core)
