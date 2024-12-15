package com.goit.pshcherba.repository;

import com.goit.pshcherba.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note, Long> {

}
