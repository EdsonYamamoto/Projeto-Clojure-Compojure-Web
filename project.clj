(defproject projeto-clojure-web "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :min-lein-version "2.0.0"
  :dependencies [
                 [org.clojure/clojure "1.10.0"]
                 [compojure "1.6.1"]
                 [ring/ring-defaults "0.3.2"]
                 [org.clojure/data.json "1.1.0"]
                 [ring/ring-json "0.5.0"]
                 ;[org.clojure/clojure-contrib "1.2.0"]   ;; for clojure.contrib.sql
                 ;[org.clojure/java.jdbc "0.0.6"]         ;; jdbc
                 ;[mysql/mysql-connector-java "5.1.6"]
                 ]
  :plugins [[lein-ring "0.12.5"]]
  :ring {:handler projeto-clojure-web.handler/app}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring/ring-mock "0.3.2"]]}})
