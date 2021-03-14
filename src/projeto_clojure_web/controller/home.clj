(ns projeto-clojure-web.controller.home
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]))

(defn wrap-app-middleware
  [handler]
  (fn [req]
    (println "App Middleware")
    (handler req)))


(defroutes app-routes
           (GET "/" _ "App")
           (POST "/" _ "Post app")
           (route/not-found "Not Found"))
