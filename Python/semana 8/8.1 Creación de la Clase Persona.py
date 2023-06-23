import logging as log
# log = loggin -> también puede hacerse así

#docs.python.org/3/howto/logging.html
#esta va a ser la base para todos los demas archivos con el manejo de loggin
#Llamamos a una configuración básica

log.basicConfig(level=log.DEBUG,
                format='%(asctime)s:%(levelname)s [%(filename)s:%(lineno)s] %(message)s',
                datefmt= '%I:%M:%S %p',#modificamos la hora
                handlers=[ #manejamos una lista
                    #al enviar información por consola
                    #también se envía a este archivo .log
                    log.FileHandler('capa_datos.log'),
                    log.StreamHandler() #la consola recibe la info
                ]
                ) #se van a ejecutar todos los mensajes a continuación
