(ns core
  (:require [goog.dom :as gdom]
            [reagent.dom.client :as rdom]))

(defonce root (rdom/create-root (gdom/getElement "app")))

(defn- app []
  [:main.container 
   [:h1 "Hello World!"]])

(defn ^:dev/after-load render []
  (js/console.log "render")
  (rdom/render root [app]))

(defn init []
  (js/console.log "init")
  (render))
