package model;

import java.io.IOException;
import java.util.List;
public interface  LecturaEscritura {
      List <Concurso> todosLosConcursos()throws IOException;
      void guardarInscripcion(Participante participante, Concurso concurso) throws IOException;

