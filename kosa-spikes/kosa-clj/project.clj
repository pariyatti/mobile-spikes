(defproject kosa-clj "0.1.0-SNAPSHOT"
  :description "Kosa service backend"
  :url "http://pariyatti.org"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [gorillalabs/neo4j-clj "4.0.1"]
                 [org.neo4j.test/neo4j-harness "4.0.0"]]
  :repl-options {:init-ns kosa-clj.core})
