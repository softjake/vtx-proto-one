FROM ${baseImage}
LABEL maintainer=jake
LABEL project=${projectArtifact}
LABEL version=${projectVersion}

ENV VERTICLE_NAME ${vertx.main-verticle}
ENV VERTICLE_HOME /deployments/${projectArtifact}
COPY /maven /$VERTICLE_HOME/

EXPOSE 8001
ENTRYPOINT ["sh", "-c"]
CMD ["exec vertx run $VERTICLE_NAME -cp $VERTICLE_HOME/*"]
