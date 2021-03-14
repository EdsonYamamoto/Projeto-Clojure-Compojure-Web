(ns projeto-clojure-web.handler
  (:use [projeto-clojure-web.controller.home]
        [projeto-clojure-web.controller.api])
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]))

(def app
  (routes (-> api-routes
              (wrap-api-middleware))
          (-> app-routes
              (wrap-app-middleware))))