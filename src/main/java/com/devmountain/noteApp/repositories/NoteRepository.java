package com.devmountain.noteApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devmountain.noteApp.entites.Note;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {
}
