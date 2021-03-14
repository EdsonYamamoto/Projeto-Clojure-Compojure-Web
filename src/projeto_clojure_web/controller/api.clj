(ns projeto-clojure-web.controller.api
  (:use [projeto-clojure-web.service.apiService]
        [projeto-clojure-web.model.apiModel]
        [ring.middleware.json :only [wrap-json-body]]
        [ring.util.response :only [response]]
        )

  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [clojure.data.json :as json]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]))

(defn handler [request]
  (prn (get-in request [:body "user"]))
  (response "Uploaded user."))

(defn wrap-api-middleware
  [handler]
  (fn [req]
    (println "API Middleware")
    (handler req)))

(defroutes api-routes
           (GET "/api" _ (println "acessando a api")
                         (json/write-str (struct personModel "george" 22 115)) )
           (POST "/api" _ "Post API")
)
