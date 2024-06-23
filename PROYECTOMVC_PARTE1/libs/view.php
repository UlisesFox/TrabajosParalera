<?php
    class View {

        function __construct() {
            echo '<p>VIsta Base.</p>';
        }

        function render($nombre) {
            require 'views/'.$nombre.'.php';
        }
    }