# Blog APIs

## Get all blogs
`GET /api/blogs/`

## Get a blog by id
`GET /api/blogs/{id}`

## Create a blog
`POST /api/blogs/`
```json
{
    "title": "Blog Title 1",
    "body": "Blog Content 1",
    "authorId": 1
}
```
## Update a blog
`PUT /api/blogs/`
```json
{
    "id": 1,
    "title": "Blog Title 1",
    "body": "Blog Content 1. Some updated content",
    "authorId": 1
}
```

## Delete a blog
`DELETE /api/blogs/{id}`
