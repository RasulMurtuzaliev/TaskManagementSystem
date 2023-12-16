CREATE TABLE users (
    id bigint PRIMARY KEY GENERATED ALWAYS AS IDENTITY UNIQUE,
    username varchar(128) NOT NULL UNIQUE,
    email varchar(128) NOT NULL UNIQUE,
    password varchar(128) NOT NULL,
    created_at timestamptz DEFAULT CURRENT_TIMESTAMP,
    updated_at timestamptz DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE task (
    id bigint PRIMARY KEY GENERATED ALWAYS AS IDENTITY UNIQUE,
    title varchar(128) NOT NULL,
    description varchar(4096),
    status varchar(128),
    priority varchar(128),
    author_id bigint NOT NULL,
    executor_id bigint NOT NULL,
    created_at timestamptz DEFAULT CURRENT_TIMESTAMP,
    updated_at timestamptz DEFAULT CURRENT_TIMESTAMP,

    CONSTRAINT fk_author_id FOREIGN KEY(author_id) REFERENCES users(id),
    CONSTRAINT fk_executor_id FOREIGN KEY(executor_id) REFERENCES users(id)
);

CREATE TABLE comment (
    id bigint PRIMARY KEY GENERATED ALWAYS AS IDENTITY UNIQUE,
    content varchar(4096) NOT NULL,
    author_id bigint NOT NULL,
    task_id bigint NOT NULL,
    created_at timestamptz DEFAULT CURRENT_TIMESTAMP,
    updated_at timestamptz DEFAULT CURRENT_TIMESTAMP,

    CONSTRAINT fk_author_id FOREIGN KEY(author_id) REFERENCES users(id),
    CONSTRAINT fk_task_id FOREIGN KEY(task_id) REFERENCES task(id)
);