(ns falcon-clj.core
  (:import [java.nio.channels SocketChannel]
           [falcon.fix Session Versions]) )


(def session (Session. (SocketChannel.) (Versions/FIX_4_2), "HERMES", "INET"))

